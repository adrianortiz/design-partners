package com.codizer.creational.builder.example2;

public class Main {

    public static void main(String[] args) {

        CourseBasicBuilder builder = new CourseBasicBuilder();
        builder.addName("Java courser")
                .addExercise("Sum all the elements of an Array")
                .addExercise("Create a function that reads a file")
                .addVideo("video-1-java.mp4")
                .addVideo("video-2-java.mp4")
                .addVideo("video-3-java.mp4")
                .addVideo("video-4-java.mp4")
                .addTest("Is Java OO?", "Is Java multiplatform?");

        Course c = builder.build();

        for (Video v : c.getVideos()) {
            System.out.println(v.getUrl());
        }
    }
}
