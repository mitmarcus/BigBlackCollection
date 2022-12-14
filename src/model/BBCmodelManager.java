package model;

import java.time.LocalDate;

public class BBCmodelManager implements BBCmodel
{
    private PlayerList memberList; //MEMBERS LIST
    private PlayerList guestList; //GUEST LIST
    private GameList gameList; //GAME LIST
    private EventList eventList;
    private ReservationList reservationList;
    private PlayerList participantsList;

    public BBCmodelManager()
    {
        memberList = new PlayerList();
        guestList = new PlayerList();
        gameList = new GameList();
        reservationList = new ReservationList();
        eventList = new EventList();
        participantsList = new PlayerList();
        createDummyData();
    }
    public void createDummyData()
    {

        //DummyData for Members List
        Player Ricardo = new Player("Ricardo", "Fernandes", 91757485, true);
        Player Jakub = new Player("Jacub", "Kuka", 91696968, true);
        Player Marcus = new Player("Marcus", "Mitela", 91696969, true);
        memberList.addMember(Ricardo);
        memberList.addMember(Jakub);
        memberList.addMember(Marcus);

        //DummyData for Guest list
        Player Filip = new Player("Filip", "asdadw", 91757485, false);
        Player Duarte = new Player("Jorge", "Duarte", 91696968, false);
        Player Stephen = new Player("Stephen", "oasdasi", 91696969, false);
        guestList.addGuest(Filip);
        guestList.addGuest(Duarte);
        guestList.addGuest(Stephen);



        //DummyData for Events
        LocalDate date11 =  LocalDate.parse("2022-12-26");
        LocalDate date22 =  LocalDate.parse("2022-12-28");
        LocalDate date33 =  LocalDate.parse("2022-12-30");

        Event e1 = new Event("Chess Tournament", "VIA", "Tournament only Available for members" ,date11);
        Event e2 = new Event("Checkers Tournament", "VIA", "Tournament only Available for members" , date22);
        eventList.addEvent(e1);
        eventList.addEvent(e2);

        //DummyData for Games

        Game g = new Game("Checkers", 2, Ricardo,0  );
        Game h = new Game ("Chess", 2, Jakub,1);
        gameList.addGame(g);
        gameList.addGame(h);



        //DummyData for GameReservations
        LocalDate date1 =  LocalDate.parse("2022-12-26");
        LocalDate date2 =  LocalDate.parse("2022-12-28");
        LocalDate date3 =  LocalDate.parse("2022-12-30");

        Reservation game = new Reservation("Ricardo", "Checkers",date1 , date2);
        Reservation game1 = new Reservation("Marcus", "Chess", date1, date3);
        reservationList.addReservation(game);
        reservationList.addReservation(game1);

        //System.out.println(game);
    }

    //MEMBERS AND GUESTS CODE
    @Override public void addMember(Player player) {
        memberList.addMember(player);
    }
    @Override public void addGuest(Player guest) {
        guestList.addGuest(guest);
    }
    @Override public void removeMember(Player player) {
        memberList.removeUser(player);
    }
    @Override public void removeGuest(Player guest){
        guestList.removeGuest(guest);
    }


    @Override public Player getMemberByFullName(String fullName) {
        return memberList.getMemberByFullName(fullName);
    }
    @Override public Player getGuestByFullName(String fullName) {
        return guestList.getGuestByFullName(fullName);
    }
    @Override public Player getMemberByPhoneNumber(Long phoneNumber) {
        return memberList.getMemberByPhone(phoneNumber);
    }
    @Override public Player getMember(int index) {
        return memberList.getMembersByIndex(index);
    }
    @Override public Player getGuestByIndex(int index) {
        return guestList.getGuestByIndex(index);
    }


    @Override public int getMemberListSize() {
        return memberList.memberSize();
    }
    @Override public int getGuestListSize() {
        return guestList.guestSize();
    }


    //Event Code
    @Override public int getEventListSize() {
        return eventList.getEventListSize();
    }
    @Override public Event getEvent(int index) {
        return eventList.getEventByIndex(index);
    }
    @Override public void addEvent(Event event) {
        eventList.addEvent(event);
    }
    @Override public void removeEvent(Event event) {
        eventList.removeEvent(event);
    }


    //Reservation code
    @Override public int getReservationListSize() {
        return reservationList.getReservationListSize();
    }
    @Override public Reservation getReservationByIndex(int index) {
        return reservationList.getReservationByIndex(index);
    }
    @Override public void addReservation(Reservation reservation) {
        reservationList.addReservation(reservation);
    }
    @Override public void removeReservation(Reservation reservation) {
        reservationList.removeReservation(reservation);
    }


    //GAMES CODE
    @Override public void addGame(Game game) {
        gameList.addGame(game);
    }
    @Override public Game getGameByName(String name) {
        return gameList.getGameByName(name);
    }
    @Override public Game getGameByIndex(int index) {
        return gameList.getGameByIndex(index);
    }
    @Override public int getGameListSize() {
        return gameList.getGamesListSize();
    }
    @Override public void removeGame(Game game) {
        gameList.removeGame(game);
    }
    @Override public void addParticipant(Player player) {

    }
}
