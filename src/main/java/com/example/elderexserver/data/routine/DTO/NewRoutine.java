package com.example.elderexserver.data.routine.DTO;

import java.util.List;

public class NewRoutine {
    private Integer staff_id;
    private String name;
    private String description;
    private List<routine_exercise> routine_exercises;

    public static class routine_exercise {
        private Integer exercise_id;
        private Integer rep;
        private Integer set;
        private Integer day;

        public routine_exercise(Integer exercise_id, Integer rep, Integer set, Integer day) {
            this.exercise_id = exercise_id;
            this.rep = rep;
            this.set = set;
            this.day = day;
        }

        public Integer getExercise_id() {
            return exercise_id;
        }

        public void setExercise_id(Integer exercise_id) {
            this.exercise_id = exercise_id;
        }

        public Integer getRep() {
            return rep;
        }

        public void setRep(Integer rep) {
            this.rep = rep;
        }

        public Integer getSet() {
            return set;
        }

        public void setSet(Integer set) {
            this.set = set;
        }

        public Integer getDay() {
            return day;
        }

        public void setDay(Integer day) {
            this.day = day;
        }
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<routine_exercise> getRoutine_exercises() {
        return routine_exercises;
    }

    public void setRoutine_exercises(List<routine_exercise> routine_exercises) {
        this.routine_exercises = routine_exercises;
    }
}
