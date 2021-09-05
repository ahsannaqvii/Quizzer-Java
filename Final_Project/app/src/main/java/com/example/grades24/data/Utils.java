package com.example.grades24.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Utils {
    public static Map<String, Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Join clauses",true);
        answer1.put("Join noun",false);
        answer1.put("Ouch!",false);
        answer1.put("None",false);
        questions.put("What is a Conjunction?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Links a noun ",true);
        answer2.put("Links an adverb",false);
        answer2.put("Links a verb",false);
        answer2.put("None of the above",false);
        questions.put("What does a Preposition do?",answer2);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("It replaces a Noun",true);
        answer5.put("It replaces Verb",false);
        answer5.put("It replaces Adverb",false);
        answer5.put("None of the above",false);
        questions.put("How best can you define a pronoun?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("That limits something",true);
        answer6.put("kind of adverb",false);
        answer6.put("replaces a noun",false);
        answer6.put("None of the above",false);
        questions.put("What is a determiner?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Thing or person?",true);
        answer7.put(" A verb",false);
        answer7.put("A teacher",false);
        answer7.put("None of the above",false);
        questions.put("What does a noun indicate?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Describes a noun?",true);
        answer8.put("Describe a person?",false);
        answer8.put("Quality",false);
        answer8.put("Quantity",false);
        questions.put("What does an Adjective do?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Action or state",true);
        answer9.put("Name",false);
        answer9.put("Place",false);
        answer9.put("only Action",false);
        questions.put("Verb is : ",answer9);


        return questions;
    }
    public static Map<String,Map<String,Boolean>> getRandomLiterateQues(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;

        originalQuestion = getLiteratureQuestions();


        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }
}
