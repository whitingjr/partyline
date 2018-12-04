package org.commonjava.util.partyline.lock;

public class UnlockStatus
{

    boolean unlocked;
    boolean dominanceChanged;
    LockLevel dominantLockLevel;

    public UnlockStatus( boolean unlocked, boolean dominanceChanged, LockLevel dominantLockLevel )
    {
        this.unlocked = unlocked;
        this.dominanceChanged = dominanceChanged;
        this.dominantLockLevel = dominantLockLevel;
    }

    public boolean isUnlocked()
    {
        return unlocked;
    }

    public boolean isDominanceChanged()
    {
        return dominanceChanged;
    }

    public LockLevel getDominantLockLevel()
    {
        return dominantLockLevel;
    }
}
