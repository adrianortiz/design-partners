package com.codizer.creational.builder.example1;

public class Main {

    public static void main(String[] args) {

        CourseBasicBuilder builder = new CourseBasicBuilder();
        builder.addName("Java courser");
        builder.addExercise("Sum all the elements of an Array");
        builder.addExercise("Create a function that reads a file");
        builder.addVideo("video-1-java.mp4");
        builder.addVideo("video-2-java.mp4");
        builder.addVideo("video-3-java.mp4");
        builder.addVideo("video-4-java.mp4");
        builder.addTest("Is Java OO?", "Is Java multiplatform?");

        Course c = builder.build();

        for (Video v : c.getVideos()) {
            System.out.println(v.getUrl());
        }
    }
}
