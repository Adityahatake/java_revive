public class BoyfriendReaction {
    public static void main(String[] args) {
        String dialogue = "main thik hoon"; // Try: "kuch nahi", "jao", "main thik hoon", "meri baat hi kyun sunoge"

        String reaction;

        switch (dialogue.toLowerCase()) {
            case "kuch nahi":
                reaction = "BF: Bhai kuch toh hai, ab poore 4 ghante lag jaayenge samajhne mein.";
                break;
            case "jao":
                reaction = "BF: Ye 'jao' ka matlab 'mat jaana' hota hai. Dil se mat le lena bro.";
                break;
            case "main thik hoon":
                reaction = "BF: Translation: 'Main bilkul bhi thik nahi hoon, tum khud samjho'.";
                break;
            case "meri baat hi kyun sunoge":
                reaction = "BF: Bas bhai, aaj toh silent treatment + guilt trip combo milega.";
                break;
            default:
                reaction = "BF: Kya bolun bhai... love ka syllabus bohot vast hai.";
        }

        System.out.println(reaction);
    }
}
