package com.example.a7minutesworkout

object Constants {

    fun defaultExerciseList() : ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val jumpingjacks = ExerciseModel(
            1,
            "Jumping jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingjacks)

        val wallSit =ExerciseModel(
            2,
            "Wall Sit",
            R.drawable.ic_wall_sit,
            false,
            false
        )
    exerciseList.add(wallSit)

        val pushup = ExerciseModel(
            3,
            "push up",
            R.drawable.ic_push_up,
            false,
            false
        )
        exerciseList.add(pushup)

        val abdominalCrunch = ExerciseModel(
            4,
            "Abdominal Crunch",
            R.drawable.ic_abdominal_crunch,
            false,
            false
        )
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(
            5,
            "Step-Up onto Chair",
            R.drawable.ic_step_up_onto_chair,
            false,
            false
        )
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(
            6,
            "Squat",
            R.drawable.ic_squat,
            false,
            false
        )
        exerciseList.add(squat)

        val triceDipOnChair = ExerciseModel(
            7,
            "Tricep Dip On Chair",
            R.drawable.ic_triceps_dip_on_chair,
            false,
            false
        )
        exerciseList.add(triceDipOnChair)

        val plank = ExerciseModel(
            8,
            "Plank",
            R.drawable.ic_plank,
            false,
            false
        )
        exerciseList.add(plank)

        val highKneesRunningInPlace = ExerciseModel(
            9,
            "Plank",
            R.drawable.ic_high_knees_running_in_place,
            false,
            false
        )
        exerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel(
            10,
            "Lunges",
            R.drawable.ic_lunge,
            false,
            false
        )
        exerciseList.add(lunges)

        val pushupAndRotation = ExerciseModel(
            11,
            "Push up and Rotation",
            R.drawable.ic_plank,
            false,
            false
        )
        exerciseList.add(pushupAndRotation)

        val sidePlank = ExerciseModel(
            12,
            "Side Plank",
            R.drawable.ic_side_plank,
            false,
            false
        )
        exerciseList.add(sidePlank)

        return exerciseList
    }
}