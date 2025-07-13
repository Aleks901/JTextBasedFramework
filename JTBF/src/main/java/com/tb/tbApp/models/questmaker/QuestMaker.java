package main.java.com.tb.tbApp.models.questmaker;

import main.java.com.tb.tbApp.models.item.Item;

public abstract class QuestMaker
{

    private String name;

    private int ExperienceReward;

    private Item itemReward;

    private QuestDifficulty difficulty;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getExperienceReward()
    {
        return ExperienceReward;
    }

    public void setExperienceReward(int experienceReward)
    {
        ExperienceReward = experienceReward;
    }

    public Item getItemReward()
    {
        return itemReward;
    }

    public void setItemReward(Item itemReward)
    {
        this.itemReward = itemReward;
    }

    public QuestDifficulty getDifficulty()
    {
        return difficulty;
    }

    public void setDifficulty(QuestDifficulty difficulty)
    {
        this.difficulty = difficulty;
    }

    public QuestMaker(String name, int experienceReward, Item itemReward, QuestDifficulty difficulty)
    {
        this.name = name;
        ExperienceReward = experienceReward;
        this.itemReward = itemReward;
        this.difficulty = difficulty;
    }

    public QuestMaker(String name, int experienceReward, QuestDifficulty difficulty) {
        this.name = name;
        ExperienceReward = experienceReward;
        this.difficulty = difficulty;
    }

    public abstract void loadSteps();


}
