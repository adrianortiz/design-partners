package com.codizer.creational.builder.example3;

public abstract class CourseBuilder {
    protected Course course;

    public CourseBuilder() {
        super();
        this.course = new Course();
    }

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public abstract CourseBuilder addVideo(String url);
    public abstract CourseBuilder addExercise(String exercise);
    public abstract CourseBuilder addTest(String ...exercises);
    public abstract Course build();

}
