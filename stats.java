public class stats {
getTotalReps(Card[] hand) {
  for(i = 0; i < 7; i++) {
    if(hand[i].getWorkout == "Push Ups")
      {
        PushupReps += hand(i).getreps;
      }else 
      if(hand[i].getWorkout == "Squats")
      {
        SquatReps += hand(i).getreps;
      }else
      if(hand[i].getWorkout == "Sit Ups")
      {
        SitupReps += hand(i).getreps;
      }else
      if(hand[i].getWorkout == "Lounges")
      {
        LoungeReps += hand(i).getreps;
      }
  }
    if(PushupReps >= SquatReps && PushupReps >= SitupReps && PushupReps >= LoungeReps){
      BignReps = PushupReps;
    }else 
    if(SquatReps >= PushupReps && SquatReps >= SitupReps && SquatReps >= LoungeReps){
      BignReps = SquatReps;
    }else 
    if(SitupReps >= PushupReps && SitupReps >= SquatReps && SitupReps >= LoungeReps){
      BignReps = SquatReps;
    } else 
    if(LoungeReps >= PushupReps && LoungeReps >= SitupReps && LoungeReps >= SquatReps){
      BignReps = LoungeReps;
    }
  getTotalRepSkipped(Card[] hand)
}

getTotalRepSkipped(Card[] hand){
  for(i = 0; i < 7; i++) {
    if(hand[i].getWorkout == "skip" && "BLUE")
      {
        PushupRepskipped += hand(i).getreps;
      }else 
      if(hand[i].getWorkout == "Squats" && "YELLOW")
      {
        SquatRepskipped += hand(i).getreps;
      }else
      if(hand[i].getWorkout == "Sit Ups" && "RED")
      {
        SitupRepskipped += hand(i).getreps;
      }else
      if(hand[i].getWorkout == "Lounges" && "GREEN")
      {
        LoungeRepskipped += hand(i).getreps;
      }
  }
}
}
