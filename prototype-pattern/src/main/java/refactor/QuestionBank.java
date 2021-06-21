/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： QuestionBank.java
 * 模块说明：
 * 修改历史：
 * 2021年06月20日 - XX - 创建。
 */
package
        refactor;

import base.AnswerQuestion;
import base.ChoiceQuestion;
import refactor.util.Topic;
import refactor.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * @author XX
 * @since 1.0
 */
public class QuestionBank implements Cloneable{
    private String candidate;
    private String number;

    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<ChoiceQuestion>();
    private ArrayList<AnswerQuestion> answerQuestions = new ArrayList<AnswerQuestion>();

    public QuestionBank append(ChoiceQuestion choiceQuestion){
        choiceQuestionList.add(choiceQuestion);
        return  this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion){
        answerQuestions.add(answerQuestion);
        return  this;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.answerQuestions = (ArrayList<AnswerQuestion>) answerQuestions.clone();
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();

        Collections.shuffle(answerQuestions);
        Collections.shuffle(choiceQuestionList);

        ArrayList<ChoiceQuestion>  choiceQuestions = questionBank.choiceQuestionList;
        for (ChoiceQuestion choiceQuestion : choiceQuestions) {
            Topic randomTopic = TopicRandomUtil.random(choiceQuestion.getOption(),choiceQuestion.getKey());
            choiceQuestion.setOption(randomTopic.getOptions());
            choiceQuestion.setKey(choiceQuestion.getKey());
        }

        return questionBank;
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n");

        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");;
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n\n");

        for (int idx = 0; idx < answerQuestions.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestions.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestions.get(idx).getKey()).append("\r\n\n");
        }

        return detail.toString();
    }
}
