package com.example.headfirst.command;

public class UpdateEmailCommand implements Command{

    private UserProfile userProfile;
    private String newEmail;

    public UpdateEmailCommand(UserProfile userProfile, String newEmail) {
        this.userProfile = userProfile;
        this.newEmail = newEmail;
    }

    @Override
    public void execute() {
        userProfile.setEmail(newEmail);
    }
}
