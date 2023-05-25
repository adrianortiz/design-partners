package com.codizer.creational.builder.example3;

public class CourseBasicBuilder extends CourseBuilder {

    public CourseBuilder addVideo(String url) {
        if (course.getName() == null) {
            throw new RuntimeException("Course without name");
        }

        if (course.getVideos().size() < 3) {
            course.addVideo(new Video(url));
        }

        return this;
    }

    public CourseBuilder addExercise(String text) {
        course.addExercise(new Exercise(text));
        return this;
    }

    public CourseBuilder addTest(String ...questions) {
        Test test = new Test();
        test.setQuestion1(questions[0]);
        test.setQuestion2(questions[1]);
        course.setTest(test);

        return this;
    }

    public Course build() {
        return course;
    }

}
