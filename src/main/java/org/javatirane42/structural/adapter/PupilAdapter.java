package org.javatirane42.structural.adapter;

public class PupilAdapter implements Student {

    private Pupil pupil;

    public PupilAdapter(Pupil pupil) {
        this.pupil = pupil;
    }

    @Override
    public String getFullName() {
        return pupil.getFirstName() + " " + pupil.getLastName();
    }

    @Override
    public boolean isAdult() {
        return pupil.getAge() >= 18;
    }
}
