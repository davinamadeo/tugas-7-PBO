import java.util.Random;

public class SupportSystem {
    public String getResponse(String input, String userName) {
        input = input.toLowerCase();

        if (input.contains("halo") || input.contains("hi")) {
            return "Halo juga, " + userName + "! Ada yang bisa aku bantu? 😊";
        } else if (input.contains("terima kasih") || input.contains("makasi")) {
            return "Sama-sama, " + userName + "! Aku senang bisa bantu! 🌟";
        } else if (input.contains("main")) {
            return "Main apa itu, " + userName + "? Aku jadi penasaran nih! 🎮";
        } else if (input.contains("belajar")) {
            return "Ayo belajar bareng, " + userName + "! Aku siap bantu 📚.";
        } else if (input.contains("cuaca")) {
            return "Hmm, aku nggak bisa cek cuaca sih, tapi aku harap harimu cerah ya, " + userName + " 🌞.";
        } else if (input.contains("bantuan")) {
            return "Aku bisa ngobrol, bantu belajar, atau bahkan ngajak kamu main kuis! Ketik 'kuis' kalau mau main! 🎉";
        } else if (input.contains("bosan")) {
            return "Bosan ya, " + userName + "? Yuk ngobrol seru atau coba main kuis! 😊";
        } else if (input.contains("sedih")) {
            return "Jangan sedih, " + userName + "! Kamu hebat, dan aku di sini buat kamu! ❤️";
        } else if (input.contains("kuis")) {
            return getQuiz();
        } else {
            return "Hmm, aku kurang paham, " + userName + ". Coba tanyakan sesuatu yang lain ya! 😅";
        }
    }

    private String getQuiz() {
        Random random = new Random();
        String[] questions = {
            "Apa ibu kota Indonesia? a) Jakarta b) Bandung c) Surabaya",
            "Berapa hasil 5 + 7? a) 10 b) 12 c) 15",
            "Siapa presiden pertama Indonesia? a) Soekarno b) Soeharto c) Habibie"
        };
        String[] answers = {"a", "b", "a"};
        int index = random.nextInt(questions.length);

        return questions[index] + "\nJawab dengan ketik hurufnya (a/b/c).";
    }
}

