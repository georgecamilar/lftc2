package lftc.automateFinite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class State {
    private boolean finalState;
    private String description;
    private Map<String, List<State>> destinations;

    public State(String description) {
        this.finalState = false;
        this.description = description;
        this.destinations = new HashMap<>();
    }

    @SuppressWarnings("serial")
    public void addDestination(String alphabetItem, State state) {
        if (!destinations.containsKey(alphabetItem)) {
            destinations.put(alphabetItem, new ArrayList<State>() {{
                add(state);
            }});
        }
        else{
            destinations.get(alphabetItem).add(state);
        }
    }

    public boolean isFinalState() {
        return finalState;
    }

    public void setFinalState(boolean finalState){
        this.finalState = finalState;
    }

    public String getDescription(){
        return description;
    }

    public Map<String, List<State>>getDestinations(){
        return destinations;
    }
    public void setDescriptions(Map<String, List<State>> descs){
        this.destinations = descs;
    }
}
