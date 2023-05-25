package com.codizer.creational.builder.example3;

public class CourseAdvanceBuilder extends CourseBuilder {

    @Override
    public CourseBuilder addVideo(String url) {
        if (course.getName() == null) {
            throw new RuntimeException("Course without name");
        }

        if (course.getVideos().size() < 10) {
            course.addVideo(new Video(url));
        }

        return this;
    }

    @Override
    public CourseBuilder addExercise(String exercise) {
        course.addExercise(new Exercise(exercise));
        return this;
    }

    @Override
    public CourseBuilder addTest(String... exercises) {
        Test test = new Test();
        test.setQuestion1(exercises[0]);
        test.setQuestion2(exercises[1]);
        test.setQuestion3(exercises[2]);
        test.setQuestion4(exercises[3]);
        course.setTest(test);

        return this;
    }

    @Override
    public Course build() {
        return course;
    }
}
