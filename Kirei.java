public class Kirei {

    public static void main(String[] args) {
        DeveloperProfile kirei = new DeveloperProfile.Builder("Matěj Šťastný")
                .pronouns("He/Him")
                .age(17)
                .nationality("Czech 🇨🇿")
                .city("Seattle 🇺🇸")
                .os(OS.MACOS)
                .languages("Java", "Bash", "GDS", "GMS")
                .tools("VS Code", "Alacritty", "Godot", "GM2")
                .artTools("Aseprite", "Blender")
                .build();

        kirei.printProfile();
    }
}

enum OS {
    WINDOWS, LINUX, MACOS
}

class DeveloperProfile {
    private final String name;
    private final String pronouns;
    private final int age;
    private final String nationality;
    private final String city;
    private final OS os;
    private final String[] languages;
    private final String[] tools;
    private final String[] artTools;

    private DeveloperProfile(Builder builder) {
        this.name = builder.name;
        this.pronouns = builder.pronouns;
        this.age = builder.age;
        this.nationality = builder.nationality;
        this.city = builder.city;
        this.os = builder.os;
        this.languages = builder.languages;
        this.tools = builder.tools;
        this.artTools = builder.artTools;
    }

    public void printProfile() {
        System.out.println("=== Kirei's Developer Profile ===");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Pronouns: %s%n", pronouns);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Nationality: %s%n", nationality);
        System.out.printf("City: %s%n", city);
        System.out.printf("OS: %s%n", os);
        System.out.println("\nLanguages: " + String.join(", ", languages));
        System.out.println("Tools: " + String.join(", ", tools));
        System.out.println("Art Tools: " + String.join(", ", artTools));
        System.out.println("\n:3");
    }

    public static class Builder {
        private final String name;
        private String pronouns;
        private int age;
        private String nationality;
        private String city;
        private OS os;
        private String[] languages = {};
        private String[] tools = {};
        private String[] artTools = {};

        public Builder(String name) {
            this.name = name;
        }

        public Builder pronouns(String pronouns) {
            this.pronouns = pronouns;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder os(OS os) {
            this.os = os;
            return this;
        }

        public Builder languages(String... languages) {
            this.languages = languages;
            return this;
        }

        public Builder tools(String... tools) {
            this.tools = tools;
            return this;
        }

        public Builder artTools(String... artTools) {
            this.artTools = artTools;
            return this;
        }

        public DeveloperProfile build() {
            return new DeveloperProfile(this);
        }
    }
}
