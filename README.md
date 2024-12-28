<h2>✨ Hiii, I'm <em>Matěj Šťastný</em>! ✨</h2>

<img align='right' src="./assets/portrait.png" width="250">


<p><em>
  High school student at <a href="https://rhs.lwsd.org/">Redmond High School</a> coding in his free time!
</em></p>


[![GitHub Kirei](https://img.shields.io/github/followers/kireiiiiiiii?label=follow&style=social)](https://github.com/kireiiiiiiii)
[![Instagram Kirei](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badg&logo=instagram&logoColor=white)](https://www.instagram.com/_kireiiiiiiii)
[![Bluesky Kirei](https://img.shields.io/badge/Bluesky-0285FF?logo=bluesky&logoColor=fff&style=for-the-badg)](https://www.instagram.com/_kireiiiiiiii)

<p>&nbsp</p>

### 💖💖 About me: 💖💖

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
        aboutMe.put("Nationality", "Czech 🇨🇿");
        aboutMe.put("Age", "17");
        aboutMe.put("Pronouns", "He/Him");
        aboutMe.put("Tools", "Java, Bash, Godot, Gamemaker 2, Blender");

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

