package com.example.elderexserver.service;

import com.example.elderexserver.data.routine.DTO.NewRoutine;
import com.example.elderexserver.data.routine.DTO.RoutineList;
import com.example.elderexserver.data.routine.DTO.RoutineListView;
import com.example.elderexserver.data.routine.Routine;
import com.example.elderexserver.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class RoutineService {

    @Autowired
    private RoutineRepository routineRepository;

    @Autowired
    private RoutineExerciseRepository routineExerciseRepository;

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private StaffRepository staffRepository;

    public RoutineList getRoutineListById(Integer routineId) {
        List<RoutineListView> routineListView = routineRepository.findRoutineListById(routineId);

        RoutineListView firstRow = routineListView.get(0);
        RoutineList routine = new RoutineList(
                firstRow.getRoutineId(),
                firstRow.getRoutineName(),
                firstRow.getRoutineDescription(),
                firstRow.getStaffFirstName(),
                firstRow.getStaffLastName(),
                new HashSet<>()
        );

        for (RoutineListView row : routineListView) {

            RoutineList.Exercise exercise = new RoutineList.Exercise(
                    row.getExerciseId(),
                    row.getExerciseName(),
                    row.getRep(),
                    row.getSet(),
                    row.getDay()
            );

            routine.exercise.add(exercise);
        }

        return routine;
    }

    public List<RoutineList> getRoutineList() {
        List<RoutineListView> routineList = routineRepository.findRoutineList();

        Map<Integer, RoutineList> routineMap = new LinkedHashMap<>();

        for (RoutineListView row : routineList) {
            RoutineList routine = routineMap.computeIfAbsent(row.getRoutineId(),
                    id -> new RoutineList(
                            id,
                            row.getRoutineName(),
                            row.getRoutineDescription(),
                            row.getStaffFirstName(),
                            row.getStaffLastName(),
                            new HashSet<>()
                    )
            );

            RoutineList.Exercise exercise = new RoutineList.Exercise(
                    row.getExerciseId(),
                    row.getExerciseName(),
                    row.getRep(),
                    row.getSet(),
                    row.getDay()
            );

            routine.exercise.add(exercise);
        }

        return new ArrayList<>(routineMap.values());
    }

    @Transactional
    public Routine newRoutine(NewRoutine newRoutine) {
        return new Routine();
    }
}
