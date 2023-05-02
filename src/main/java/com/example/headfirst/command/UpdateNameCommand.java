package com.example.headfirst.command;

public class UpdateNameCommand implements Command{
    private UserProfile userProfile;
    private String newName;

    public UpdateNameCommand(UserProfile userProfile, String newName) {
        this.userProfile = userProfile;
        this.newName = newName;
    }

    @Override
    public void execute() {
        userProfile.setName(newName);
    }
}
