package com.company.homework22;

public class DancingRobot implements Dance{
    private String balet;
    private String hiphop;
    private String jazz;

    public DancingRobot (String balet, String hiphop, String jazz){
        this.balet = balet;
        this.hiphop = hiphop;
        this.jazz = jazz;
    }

    @Override
    public String getDefaultDanceType() {
        return null;
    }
}
