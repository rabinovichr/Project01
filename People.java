package Project01;

import Project01.PeopleType;

public class People
{
    private String personName;
    private String myNation;
    private String myTribe;
    private PeopleType me;
    private String myDescription;
    private int myLifePoints;


    public People(String nation, String tribe, PeopleType person, int lifePoints)
    {
        myNation = nation;
        myTribe = tribe;
        me = person;
        myDescription = me.getDescription();
        myLifePoints = lifePoints;
    }

    public PeopleType getType()
    {
        return me;
    }

    public String getTribe()
    {
        return myTribe;
    }

    public String getNation()
    {
        return myNation;
    }

    public Boolean isPersonAlive()
    {
        return (myLifePoints > 0);
    }

    public int getLifePoints()
    {
        return myLifePoints;
    }

    public void encounterStrategy(People otherPerson)
    {
        if(myNation == otherPerson.getNation())
        {
            // There will be an ugly confrontation
            // Groups attack groups. Group can be an individual or several individuals from any set of tribes
            // if a group has enough lifePoints it can capture its opponent and make it part of the group.
            // Captured opponents do not fight or heal very well. The healers can heal people from same nation
            // normally.
        }
        else
        {
            // there will be a peaceful confrontation
            // warriors - warrior ignore each other if different tribes increase life points
            // healer - healer ignore each other
            // healer - warrior - healer can heal warrior. Heals warrior from same tribe better
        }
    }


    public void reduceLifePoints(int points)
    {
        myLifePoints = myLifePoints - points;
    }


    public String toString()
    {
        String result = new String( myNation + "\t" +  myTribe + "\t" + me + "\t" + myDescription + "\t" + myLifePoints);
        return result;
    }
}

