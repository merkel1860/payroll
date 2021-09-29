package core.model;

public class Remunaration {
    private Salary salary;
    private SocialAdvantages socialAdvantages;
    private String descritption;
    private float promotionRate;
    private int requiredYearOfExperience;

    public Remunaration() {
    }

    public Remunaration(Salary salary, String descritption,
                        float promotionRate,
                        int requiredYearOfExperience) {
        this.salary = salary;
        this.descritption = descritption;
        this.promotionRate = promotionRate;
        this.requiredYearOfExperience = requiredYearOfExperience;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public SocialAdvantages getSocialAdvantages() {
        return socialAdvantages;
    }

    public void setSocialAdvantages(SocialAdvantages socialAdvantages) {
        this.socialAdvantages = socialAdvantages;
    }

    public String getDescritption() {
        return descritption;
    }

    public void setDescritption(String descritption) {
        this.descritption = descritption;
    }

    public float getPromotionRate() {
        return promotionRate;
    }

    public void setPromotionRate(float promotionRate) {
        this.promotionRate = promotionRate;
    }

    public int getRequiredYearOfExperience() {
        return requiredYearOfExperience;
    }

    public void setRequiredYearOfExperience(int requiredYearOfExperience) {
        this.requiredYearOfExperience = requiredYearOfExperience;
    }
}
