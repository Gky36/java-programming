package Practice;

public class Animals
{
    String gender;
    int age;
    int height;
    String food;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", food='" + food + '\'' +
                '}';
    }
}
