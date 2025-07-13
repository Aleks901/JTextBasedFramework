package main.java.com.tb.tbApp.models.questmaker.quests;

import main.java.com.tb.tbApp.models.item.Item;
import main.java.com.tb.tbApp.models.questmaker.QuestDifficulty;
import main.java.com.tb.tbApp.models.questmaker.QuestMaker;

public class QuestTemplate extends QuestMaker
{


    public QuestTemplate(String name, int experienceReward, Item itemReward, QuestDifficulty difficulty)
    {
        super(name, experienceReward, itemReward, difficulty);
    }


    @Override
    public void loadSteps()
    {

    }
}
