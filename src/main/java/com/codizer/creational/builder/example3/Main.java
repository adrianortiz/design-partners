package com.codizer.creational.builder.example3;

public class Main {

    public static void main(String[] args) {

        CourseBuilder builder = new CourseAdvanceBuilder();
        builder.addName("Java courser")
                .addExercise("Sum all the elements of an Array")
                .addExercise("Create a function that reads a file")
                .addVideo("video-1-java.mp4")
                .addVideo("video-2-java.mp4")
                .addVideo("video-3-java.mp4")
                .addVideo("video-4-java.mp4")
                .addVideo("video-5-java.mp4")
                .addTest("Is Java OO?", "Is Java multiplatform?", "question 3", "question 4");

        Course c = builder.build();

        for (Video v : c.getVideos()) {
            System.out.println(v.getUrl());
        }

        System.out.println(c.getTest().getQuestion1());
        System.out.println(c.getTest().getQuestion2());
        System.out.println(c.getTest().getQuestion3());
        System.out.println(c.getTest().getQuestion4());

    }
}
