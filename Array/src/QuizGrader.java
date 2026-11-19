public class QuizGrader {//ito ang ating class name
    public static void main(String[] args){//ito naman ang ating main execution o ginagamit natin para i run ang code
        char[]answerKey = {'A','C','B','D','A','C','C','B','A','D'};//nag declare tayo ng char at ang pangalan ay answerKey
        char[]studentAnswers = {'A','B','B','D','C','C','C','B','A','A'};//nag declare ulit tayo ng char at ang pangalan ay studentAnswers

        int correctCount = 0;//nag declare tayo ng integer na may initial value na 0
        for(int i = 0; i < answerKey.length;i++){//ito naman ang ating loop conditon
            if(answerKey[i] == studentAnswers[i]){//dito kinokompara natin ang answerKey sa studenAnswers kung pareho ba sila
                correctCount++;//kapag tama ang conditon mag rurun ang code na ito at madadagdagan ng isa
            }
        }
        double scorePecentage = (double) correctCount / answerKey.length*100;//nag declare tayo ng double tapos cinonvert natin ang int correctCount sa double
        // para makuha natin and decimals tapos dinivide natin ito sa 10 kase 10 ang laman ng answerkey tapos minultiply sa 100
        System.out.println("Correct Answers:" + correctCount + "/" + answerKey.length);//dinisplay natin ang output ng Correct Answers
        System.out.printf("Score Percentage: %.2f%%\n",scorePecentage);//dinisplay natin ang output ng Score Percentage

        System.out.println("Incorrect Answers:");//dinisplay natin ang Incorrect na Answers
        for(int i = 0; i < answerKey.length; i++){//ito ang loop conditon natin dito
            if(answerKey[i] != studentAnswers[i]){//dito kinokompara ulit natin ang answerKey sa studentAnswer kung hindi ba sila pareho
                System.out.println("Question " + (i+1) + " Your Answer:" + studentAnswers[i] + " Correct Answer:" + answerKey[i]);//dinisplay natin ang question number
                //at and kayang answer at kung anong tamang answer
            }
        }
    }
}
