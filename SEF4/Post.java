import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;

public class Post {
    public String postType; public String postEmergency; public ArrayList<String> postComments = new ArrayList<>(); public int postID; public String postTitle; public String postBody; public String[] postTags;
    public static final ArrayList<String> postTypes = new ArrayList<>(Arrays.asList("Easy", "Difficult", "Very Difficult"));
    public static final ArrayList<String> emergencyTypes = new ArrayList<>(Arrays.asList("Ordinary", "Highly Needed", "Immediately Needed"));
    
    // addpost method 
    public boolean addPost() {
        //test to make sure all everthing is valid before it is written
        if (!postTitleCheck(postTitle) || !postBodyCheck(postBody) || !postTagCheck(postTags) || !postTypeCheck() || !postEmergencyCheck()) {
            return false;
        }
        try (FileWriter postFile = new FileWriter("post.txt", true)) {
            postFile.write("ID: " + postID + "\n");

            postFile.write("Title: " + postTitle + "\n");

            postFile.write("Body: " + postBody + "\n");

            postFile.write("Tags: " + String.join(", ", postTags) + "\n");

            postFile.write("Type: " + postType + "\n");

            postFile.write("Emergency: " + postEmergency + "\n");

            postFile.write("Comments: " + postComments.size() + "\n\n");

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // addcommmetn method
    public boolean addComment(String comment) {
        if (!commentChecker(comment) || postComments.size() >= 5 || ((postType.equals("Easy")) && (postComments.size() >= 3)) || (postEmergency.equals("Ordinary") && (postComments.size()>= 3))) {
            return false;
        }
    
        postComments.add(comment);
    
        try (FileWriter commentfile = new FileWriter("comment.txt", true)) {
            commentfile.write("Post ID: " + postID + "\n");
            commentfile.write("Comment: " + comment + "\n\n");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // method to check the posts title
    private boolean postTitleCheck(String title) {

        if (title.length() < 10 || title.length() > 250) {
            return false;
        }

        for (int i = 0; i < 5; i++) {

            if (!Character.isLetter(title.charAt(i))) {
                return false;
            }
        }

        return true;
    }


    private boolean postBodyCheck(String body) {
        if (body.length() < 250) {
            return false;
        }

        if (postType.equals("Very Difficult") || postType.equals("Difficult")) {
            return body.length() >= 300;
        }

        return true;
    }

    private boolean postTagCheck(String[] tags) {
        if (tags.length < 2 || tags.length > 5) {
            return false;
        }

        for (String checker : tags) {
            if (checker.length() < 2 || checker.length() > 10 || !checker.equals(checker.toLowerCase())) {
                return false;
            }
        }
        if (postType.equals("Easy") && tags.length > 3) {
            return false;
        }

        return true;
    }


    private boolean postTypeCheck() { // chekcs to make sure the type is post type is correct easy, difficult, very difficult
        return postTypes.contains(postType);
    }


    private boolean postEmergencyCheck() { // checks if the emergency is correct ordinary, highly needed, immidetly needed
        if (!emergencyTypes.contains(postEmergency)) { //if it is not one of the three return false
            return false;
        }

        if (postType.equals("Easy")) {
            return !postEmergency.equals("Immediately Needed") && !postEmergency.equals("Highly Needed");
        } else {
            return !postEmergency.equals("Ordinary");
        }
    }

    private boolean commentChecker(String comment) {
        String[] words = comment.split(" ");

        if (words.length > 10 || words.length < 4) { // makes sure that the comment is the correct length
            return false;
        }

        return Character.isUpperCase(words[0].charAt(0)); //makes sure the first letter is upper case
    }

    // getter methods
    public int getPostID() { // returns the post id

        return postID;
    }
    public String getPostTitle() { // returns the post title

        return postTitle;
    }


    public String getPostBody() { // returns the post body
        return postBody;
    }

    public String[] getPostTags() { // returns the post tage
        return postTags;
    }
    public String getPostType() {return postType;}

    public String getPostEmergency() {return postEmergency;}


    public ArrayList<String> getPostComments() { return postComments;}
    public int getCommentAmount() { /* returns the ammount of comment redundent as it was only used for previous testing */ int num = postComments.size(); return num;}

//  setter methods
    public void setPostID(int postID) {this.postID = postID;}


    public void setPostTitle(String postTitle) { /*0 sets post title */this.postTitle = postTitle;}

    public void setPostBody(String postBody) { this.postBody = postBody; } // sets the bodyg

    public void setPostTags(String[] postTags) {this.postTags = postTags;}

    public void setPostType(String postType) {this.postType = postType;}


    public void setPostEmergency(String postEmergency) { this.postEmergency = postEmergency;}
    
}