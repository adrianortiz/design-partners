package com.codizer.creational.builder.example1;

public class CourseBasicBuilder {

    private Course course;

    public CourseBasicBuilder() {
        super();
        this.course = new Course();
    }

    public void addName(String name) {
        course.setName(name);
    }

    public void addVideo(String url) {
        if (course.getName() == null) {
            throw new RuntimeException("Course without name");
        }

        if (course.getVideos().size() < 3) {
            course.addVideo(new Video(url));
        }
    }

    public void addExercise(String text) {
        course.addExercise(new Exercise(text));
    }

    public void addTest(String ...questions) {
        Test test = new Test();
        test.setQuestion1(questions[0]);
        test.setQuestion2(questions[1]);
        course.setTest(test);
    }

    public Course build() {
        return course;
    }

}
