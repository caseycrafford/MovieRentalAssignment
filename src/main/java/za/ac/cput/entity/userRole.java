package za.ac.cput.entity;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */
public class userRole {

    private int userId, roleId;

    public userRole(userRoleBuilder userRoleBuilder) {

        this.roleId = userRoleBuilder.roleId;
        this.userId = userRoleBuilder.userId;


    }

    public static class userRoleBuilder
    {
        private int userId, roleId;

        public userRoleBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public userRoleBuilder setRoleId(int roleId) {
            this.roleId = roleId;
            return this;
        }
        public userRole build()
        {
            return new userRole(this);
        }
    }

    @Override
    public String toString() {
        return "userRole{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}