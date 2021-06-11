package za.ac.cput.entity;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */
public class Role {
    private int roleId;
    private String name,description;

    public Role(roleBuilder roleBuilder) {

        this.roleId = roleBuilder.roleId;
        this.name = roleBuilder.name;
        this.description = roleBuilder.description;
    }

    public static class roleBuilder
    {
        private int roleId;
        private String name,description;

        public roleBuilder setRoleId(int roleId) {
            this.roleId = roleId;
            return this;
        }

        public roleBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public roleBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Role build()
        {
            return new Role(this);
        }
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
