/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author pcsidcav
 */
public class Guest {
    private String name;
    private int age;
    private double donatedAmount;
    private String organization;
    private String gender;
    private String[] interests;
    private boolean politician;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the donatedAmount
     */
    public double getDonatedAmount() {
        return donatedAmount;
    }

    /**
     * @param donatedAmount the donatedAmount to set
     */
    public void setDonatedAmount(double donatedAmount) {
        this.donatedAmount = donatedAmount;
    }

    /**
     * @return the organization
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the topics
     */
    public String[] getInterests() {
        return interests;
    }

    /**
     * @param interests the topics to set
     */
    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    /**
     * @return the politician
     */
    public boolean isPolitician() {
        return politician;
    }

    /**
     * @param politician the politician to set
     */
    public void setPolitician(boolean politician) {
        this.politician = politician;
    }
    
    
}
