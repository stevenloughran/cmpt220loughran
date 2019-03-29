// Steven Loughran
// Lab 6 SoccerMatch
// 20 March 2019

import java.util.*;

class Player {
	String name;
	int goals;
	String team;

	Player() {
		name = team = "";
		goals = 0;
	}

	Player(String name, int goal, String team)  {
		this.name = name;
		this.goals = goal;
		this.team = team;
		}

	void setName(String name)  {
		this.name = name;
	}

	void setTeam(String team) {
		this.team = team;
	}

	void setGoals(int goals) {
		this.goals = goals;
		}

	String getName() {
		return name;
		}

	String getTeam() {
		return team;
	}

	int getGoals() {
		return goals;
	}

	public String toString()	{
		return "\n Player Name: " + name + "\t Team: " + team + "\t Goals: " + goals;
	}
}

	class Goal	{
		int minute;
		Player player;

		Goal()	{
			minute = 0;
			player = null;
		}

		Goal(int min, Player p)	{
			minute = min;
			player = p;
		}

		void setMinute(int minute)	{
			this.minute = minute;
			}

		void setPlayer(Player player)	{
			this.player = player;
			}

		int getMinute()	{
			return minute;
		}

		Player getPlayer()	{
			return player;
		}

		public String toString()	{
			return "\n Minute at which the goal is scored: " + minute +
					"\n The player scored the goal: " + player.getName();
		}
	}

		public class SoccerMatch	{
			Date startTime, endTime;
			String venue, home, visitor;
			Player homePlayers[], visitorPlayers[];
			Goal homeGoals[], visitorGoals[];

			int homePlayerCounter, visitPlayerCounter;
			int homeGoalCounter, visitGoalCounter;

		SoccerMatch()	{
			startTime = endTime = null;
			venue = home = visitor = null;
			homePlayers = new Player[11];
			visitorPlayers = new Player[11];
			homeGoals = new Goal[10];
			visitorGoals = new Goal[10];
			homePlayerCounter = visitPlayerCounter = homeGoalCounter = visitGoalCounter = 0;

			for(int x = 0; x < 11; x++)	{
				homePlayers[x] = new Player();
				visitorPlayers[x] = new Player();
			}
			for(int x = 0; x < 10; x++)	{
				homeGoals[x] = new Goal();
				visitorGoals[x] = new Goal();
			}
		}

		SoccerMatch(Date st, Date en, String ven, String ho, String vi)	{
			this();
			startTime = st;
			endTime = en;
			venue = ven;
			home = ho;
			visitor = vi;
		}

		void addHomePlayer(Player p)	{
			homePlayers[homePlayerCounter++] = p;
		}

		void addVisitorPlayer(Player p)	{
			visitorPlayers[visitPlayerCounter++] = p;
		}

		void addHomeGoal(Goal g)	{
			homeGoals[homeGoalCounter++] = g;
		}

		void addVisitorGoal(Goal g)	{
			visitorGoals[visitGoalCounter++] = g;
		}

		int [] getHomeGoals()	{
			int goals[] = new int[10];
				for(int x = 0; x < 10; x++)
					goals[x] = homeGoals[x].getPlayer().getGoals();
				return goals;
		}

		int [] getVisitorGoals()	{
			int goals[] = new int[10];
				for(int x = 0; x < 10; x++)
					goals[x] = visitorGoals[x].getPlayer().getGoals();
				return goals;
		}

		String getWinner()	{
			String winnerStatus = "";
			int homeGoals[] = getHomeGoals();
			int visitGoals[] = getVisitorGoals();
			int totHome = 0, totVisit = 0;
				for(int x = 0; x < 10; x++)	{
					totHome += homeGoals[x];
					totVisit += visitGoals[x];
				}

			winnerStatus = "\n Home Team Total Goals: " + totHome + "\n Visitor Team Total Goals: " + totVisit;
			if(totHome > totVisit)
				winnerStatus += "\n Winner: Home Team";
			else if(totVisit > totHome)
				winnerStatus += "\n Winner: Visitor Team";
			else
				winnerStatus += "\n Tie";
			return winnerStatus;
		}

		public static void main(String[] args)	{
			Random rand = new Random();
			Date d1 = new Date(1, 2, 10, 12, 30);
			Date d2 = new Date(1, 2, 12, 40, 30);
			SoccerMatch soccerMatch = new SoccerMatch(d1, d2, "", "", "");
			String homePlayerName [] = {"Paul", "Mike", "Tanner", "Adam", "Conner", "Sam", "Kevin", "Chris", "Tom", "Andy", "Mary"};
			String visitPlayerName [] = {"Sarah", "Nena", "Alex", "Justin", "Vic", "Aileen", "Richard", "Eric", "Sean", "Marie", "Sue"};
			
			for(int x = 0; x < 11; x++)	{
					soccerMatch.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Portugal"));
					soccerMatch.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Spain"));
				}
				for(int x = 0; x < 10; x++)	{
					soccerMatch.addHomeGoal(new Goal(rand.nextInt(59), soccerMatch.homePlayers[x]));
					soccerMatch.addVisitorGoal(new Goal(rand.nextInt(59), soccerMatch.visitorPlayers[x]));
				}

			System.out.print("\n-------------Home Team Players-------------");
				for(int x = 0; x < 11; x++)
					System.out.println(soccerMatch.homePlayers[x]);
					System.out.print("\n-------------Visiting Team Players-------------");
					for(int x = 0; x < 11; x++)
						System.out.println(soccerMatch.visitorPlayers[x]);
						System.out.print("\n-------------Home Team Goals-------------");
						for(int x = 0; x < 10; x++)
							System.out.println(soccerMatch.homeGoals[x]);
							System.out.print("\n-------------Visiting Team Goals-------------");
							for(int x = 0; x < 10; x++)
								System.out.println(soccerMatch.visitorGoals[x]);
								System.out.print("\n-------------Game Status-------------");
								System.out.println(soccerMatch.getWinner());
								System.out.print(" Start Time: " + d1);
								System.out.print("\n");
								System.out.print(" End Time: " + d2);
		}
	}
		