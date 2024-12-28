<h2>✨ Hiii, I'm <em>Matěj Šťastný</em>! ✨</h2>

<img align='right' src="./assets/sidebar.png" width="250">


<p>
  High school student at <a href="https://rhs.lwsd.org/">Redmond High School</a> coding games and other things in my free time! I like to code in <code>Java</code>, but I also use game engines like <code>Gamemaker 2</code>, <code>Godot</code>, <code>Unreal Engine 5</code> or <code>Unity</code>. You can reach me throught my <a href="https://www.instagram.com/_kireiiiiiiii">Instagram DM's</a>!
</p

[![GitHub Kirei](https://img.shields.io/github/followers/kireiiiiiiii?label=follow&style=social)](https://github.com/kireiiiiiiii)
[![Instagram Kirei](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badg&logo=instagram&logoColor=white)](https://www.instagram.com/_kireiiiiiiii)
[![Bluesky Kirei](https://img.shields.io/badge/Bluesky-0285FF?logo=bluesky&logoColor=fff&style=for-the-badg)](https://www.instagram.com/_kireiiiiiiii)

<p>&nbsp</p>

<h3 align="center"> 💖💖 About me: 💖💖 </h3>

```java
import java.util.HashMap;
import java.util.Map;

public class Kirei {

    /**
    * Returns the data collected about @kireiiiiiiii
    *
    */
    private static Map<String, String> getData() {
        Map<String, String> aboutMe = new HashMap<>();

        aboutMe.put("Name", "Matěj Šťastný");
        aboutMe.put("Pronouns", "He/Him");
        aboutMe.put("Age", "17");
        aboutMe.put("Nationality", "Czech 🇨🇿");
        aboutMe.put("City", "Seattle 🇺🇸");
        aboutMe.put("OS", "MacOS");
        aboutMe.put("Languages", "Java, Bash, GDS, GMS");
        aboutMe.put("Tools", "VS Code, Alacritty, Godot, GM2");
        aboutMe.put("Art", "Aseprite, Blender");

        return aboutMe;
    }

    /**
    * Main
    */
    public static void main(String[] args) {
        Map<String, String> aboutMe = getData();

        for (Map.Entry<String, String> entry : aboutMe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(":3");
    }

}
```

<img alt="footer" align='center' src="./assets/footer.png">
