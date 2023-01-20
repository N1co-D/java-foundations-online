package ru.itsjava.collections.lists.HW;

import java.util.ArrayList;
import java.util.List;

public class MainHW1 {
    public static void main(String[] args) {

        Book thinkingFastAndSlow = new Book("Thinking, Fast And Slow", "Daniel Kahneman", 499);
        Book mindsetTheNewPsychologyOfSuccess = new Book("Mindset: The New Psychology of Success", "Carol Dweck", 320);
        Book shoeDogMemoirByTheCreatorOfNike = new Book("Shoe dog: Memoir by the Creator of Nike", "Phil Knight", 386);
        Book zeroToOneNotesOnStartupsOrHowToBuildTheFuture = new Book("Zero to One: Notes on Startups, or How to Build the Future", "Peter Thiel", 100);
        Book hitMakersTheScienceOfPopularityInAnAgeOfDistraction = new Book("Hit Makers: The Science of Popularity in an Age of Distraction", "Derek Thompson", 352);
        Book irresistibleTheRiseOfAddictiveTechnologyAndTheBusinessOfKeepingUsHooked = new Book("Irresistible: The Rise of Addictive Technology and the Business of Keeping Us Hooked", "Adam Alter", 368);
        Book thePowerOfMomentsWhyCertainExperiencesHaveExtraordinaryImpact = new Book("The Power of Moments: Why Certain Experiences Have Extraordinary Impact", "Chip Heath, Dan Heath", 320);
//        Book goodToGreatWhySomeCompaniesMakeTheLeapAndOthersDont = new Book("Good to Great: Why Some Companies Make the Leap and Others Don't", "Jim Collins", 400);
//        Book deliveringHappiness = new Book("Delivering happiness", "Tony Hsieh", 272);
//        Book theInnovatorsDilemmaTheRevolutionaryBookThatWillChangeTheWayYouDoBusiness = new Book("The Innovator's Dilemma: The Revolutionary Book That Will Change the Way You Do Business", "Clayton M. Christensen", 336);
//        Book steveJobs = new Book("Steve Jobs", "Wolter Isaacson", 656);
//        Book myLifeAndWork = new Book("My Life and Work", "Henry Ford", 172);
//        Book theLeanStartupHowTodaysEntrepreneursUseContinuousInnovationToCreateRadicallySuccessfulBusinesses = new Book("The Lean Startup: How Today's Entrepreneurs Use Continuous Innovation to Create Radically Successful Businesses", "Eric Ries", 336);
//        Book howToWinFriendsAndInfluencePeople = new Book("How to Win Friends & Influence People", "Dale Carnegie", 320);
//        Book startWithWhyHowGreatLeadersInspireEveryoneToTakeAction = new Book("Start with Why: How Great Leaders Inspire Everyone to Take Action", "Simon Sinek", 256);
//        Book theHardThingAboutHardThingsBuildingABusinessWhenThereAreNoEasyAnswers = new Book("The Hard Thing About Hard Things: Building a Business When There Are No Easy Answers", "Ben Horowitz", 304);
//        Book richDadPoorDadWhattheRichTeachTheirKidsAboutMoneyThatThePoorAndMiddleClassDoNot = new Book("Rich Dad Poor Dad: What the Rich Teach Their Kids About Money That the Poor and Middle Class Do Not!", "Robert T. Kiyosaki", 336);
//        Book rework = new Book("Rework", "Jason Fried, David Heinemeier Hansson", 288);
//        Book theTippingPointHowLittleThingsCanMakeABigDifference = new Book("The Tipping Point: How Little Things Can Make a Big Difference", "Malcolm Gladwell", 301);
//        Book theEMythRevisitedWhyMostSmallBusinessesDontWorkAndWhatToDoAboutIt = new Book("The E-Myth Revisited: Why Most Small Businesses Don't Work and What to Do About It", "Michael E. Gerber", 288);

        List<Book> bookList1 = new ArrayList<>();
        List<Book> bookList2 = new ArrayList<>(20);

        bookList1.add(thinkingFastAndSlow);
        bookList1.add(mindsetTheNewPsychologyOfSuccess);
        bookList1.add(shoeDogMemoirByTheCreatorOfNike);
        bookList1.add(zeroToOneNotesOnStartupsOrHowToBuildTheFuture);
        bookList1.add(hitMakersTheScienceOfPopularityInAnAgeOfDistraction);

        System.out.println("bookList1 = " + bookList1);

        bookList1.add(2,irresistibleTheRiseOfAddictiveTechnologyAndTheBusinessOfKeepingUsHooked); // позиция 3 = индекс 2
        bookList1.add(0,thePowerOfMomentsWhyCertainExperiencesHaveExtraordinaryImpact); // позиция 1 = индекс 0

        bookList2.addAll(bookList1);

        System.out.println("bookList2 = " + bookList2);

        System.out.println("bookList1.get(0) = " + bookList1.get(0));
        System.out.println("bookList1.get(5) = " + bookList1.get(5));

        bookList1.remove(1);
        bookList1.remove(hitMakersTheScienceOfPopularityInAnAgeOfDistraction);

        System.out.println("bookList1 = " + bookList1);

        System.out.println("bookList1.contains(hitMakersTheScienceOfPopularityInAnAgeOfDistraction) = " + bookList1.contains(hitMakersTheScienceOfPopularityInAnAgeOfDistraction));
        System.out.println("bookList1.contains(mindsetTheNewPsychologyOfSuccess) = " + bookList1.contains(mindsetTheNewPsychologyOfSuccess));

        System.out.print("List: [ ");
        for (Book bookElement:bookList1) {
            System.out.print(bookElement + "; ");
        }
        System.out.print("]");

    }

}
