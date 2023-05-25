package com.codizer.creational.builder.example2;

public class CourseBasicBuilder {

    private Course course;

    public CourseBasicBuilder() {
        super();
        this.course = new Course();
    }

    public CourseBasicBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBasicBuilder addVideo(String url) {
        if (course.getName() == null) {
            throw new RuntimeException("Course without name");
        }

        if (course.getVideos().size() < 3) {
            course.addVideo(new Video(url));
        }

        return this;
    }

    public CourseBasicBuilder addExercise(String text) {
        course.addExercise(new Exercise(text));
        return this;
    }

    public CourseBasicBuilder addTest(String ...questions) {
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
