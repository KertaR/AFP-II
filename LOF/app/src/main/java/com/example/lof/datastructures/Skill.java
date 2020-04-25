package com.example.lof.datastructures;

public interface Skill {
    void PrimarySkill(Character own, Character enemy);
    void SecondarySkill(Character own, Character enemy);
    void TertiarySkill(Character own, Character enemy);
    void QuaternarySkill(Character own, Character enemy);

    void EndRound();
}
