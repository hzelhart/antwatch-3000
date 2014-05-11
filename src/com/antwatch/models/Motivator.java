package com.antwatch.models;

/**
 * Created by holly on 5/10/14.
 */
public class Motivator {

    //need an enum or something of cues that affect ants, ant reactions (avoid, attack, approach, release pheromone, whatever ants do) and intensity of reaction (run away right now vs stay there but feel slightly awkward)
    private EnvironmentCue cue; //enum?
    private String reaction; //also should be a set selection of things
    private String intensityOfReaction; //set intensity levels - 1 to 10? small medium large?

}
