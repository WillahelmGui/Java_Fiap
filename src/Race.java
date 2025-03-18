import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;


@Getter
@Setter
public class Race {
    Pilot[]racingPilots = new Pilot[4];
    Pilot lastWinner = null;

    Pilot startRace(Pilot[] pilots){

        return Arrays.stream(pilots).toList().get((int) Math.round(Math.random() * 3));
    }

    void printAllWins(){
        for (Pilot p : racingPilots) {
            System.out.println("Nome: " + p.name + " || " + "Vitórias: " + p.totalWins);
        }
    }
}
