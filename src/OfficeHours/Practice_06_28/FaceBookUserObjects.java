package OfficeHours.Practice_06_28;

public class FaceBookUserObjects
{
    public static void main(String[] args) {
        FacebookUser userOne = new FacebookUser("james","james");
        System.out.println(userOne);

        FacebookUser userTwo = new FacebookUser("adam3223","31324325","Adam James",12,4000);
        System.out.println(userTwo);
        userOne.sendFriendRequest(userTwo);

        System.out.println(userOne);
        System.out.println(userTwo);

        userOne.post("This is my first post!");

        userOne.post("I like this app");

        System.out.println(userOne.getAllPost());
    }
}
