public class GirlfriendMood {
    public static void main(String[] args) {
        int replyTime = 3;
        String mood;

        switch (replyTime) {
            case 1:
                mood = "GF: Aww baby you're the best *already planning shaadi*";
                break;
            case 2:
                mood = "GF: Hmmm... toh ab busy hone lage ho tum?";
                break;
            case 3:
                mood = "GF: Wow, 1 ghante baad reply? Toh main kaun hoon? Zomato order?";
                break;
            case 4:
                mood = "GF: Seen karke ignore? BLOCKED. Tumhara chapter khatam.";
                break;
            default:
                mood = "GF: Mujhse galti ho gayi tumse pyaar karke. Bye forever... (10 mins later: 'U okay?')";
        }

        System.out.println(mood);
    }
}
