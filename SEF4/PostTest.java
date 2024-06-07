
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    void testAddPost() {
        // 1: Testing a valid post
        Post post1a = new Post();
        post1a.setPostID(1);
        post1a.setPostTitle("ValidTitle");
        post1a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post1a.setPostTags(new String[]{"tag1", "tag2"});
        post1a.setPostType("Difficult");
        post1a.setPostEmergency("Highly Needed");
        assertTrue(post1a.addPost());


        // 1: Testing a valid post 2nd data set
        Post post1b = new Post();
        post1b.setPostID(2);
        post1b.setPostTitle("AnotherValidTitle");
        post1b.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post1b.setPostTags(new String[]{"tag3", "tag4"});
        post1b.setPostType("Difficult");
        post1b.setPostEmergency("Highly Needed");
        assertTrue(post1b.addPost());

        // 2: Title with special characters in the first five letters
        Post post2a = new Post();
        post2a.setPostID(3);
        post2a.setPostTitle("1!2@special");
        post2a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post2a.setPostTags(new String[]{"tag1", "tag2"});
        post2a.setPostType("Difficult");
        post2a.setPostEmergency("Highly Needed");
        assertFalse(post2a.addPost());


        // 2: Title with special characters in the first five letters 2nd data set
        Post post2b = new Post();
        post2b.setPostID(4);
        post2b.setPostTitle("!@#$%Title");
        post2b.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post2b.setPostTags(new String[]{"tag1", "tag2"});
        post2b.setPostType("Difficult");
        post2b.setPostEmergency("Highly Needed");
        assertFalse(post2b.addPost());

        // 3: Body with exactly 250 characters
        Post post3a = new Post();
        post3a.setPostID(5);
        post3a.setPostTitle("ValidTitle");
        post3a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure do..");
        post3a.setPostTags(new String[]{"tag1", "tag2"});
        post3a.setPostType("Easy");
        post3a.setPostEmergency("Ordinary");
        assertTrue(post3a.addPost());

        // 3: Body with exactly 250 characters 2nd data set
        Post post3b = new Post();
        post3b.setPostID(6);
        post3b.setPostTitle("AnotherValidTitle");
        post3b.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure do..");
        post3b.setPostTags(new String[]{"tag3", "tag4"});
        post3b.setPostType("Difficult");
        post3b.setPostEmergency("Highly Needed");
        assertFalse(post3b.addPost());

        // 4: Test post with too short of a title
        Post post4a = new Post();
        post4a.setPostID(7);
        post4a.setPostTitle("short");
        post4a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post4a.setPostTags(new String[]{"tag3", "tag4"});
        post4a.setPostType("Difficult");
        post4a.setPostEmergency("Highly Needed");
        assertFalse(post4a.addPost());

        // 4: Test post with too short of a title 2nd data set
        Post post4b = new Post();
        post4b.setPostID(8);
        post4b.setPostTitle("a");
        post4b.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post4b.setPostTags(new String[]{"tag3", "tag4"});
        post4b.setPostType("Difficult");
        post4b.setPostEmergency("Highly Needed");
        assertFalse(post4b.addPost());

        // 5: Test post with a body which is too short
        Post post5a = new Post();
        post5a.setPostID(9);
        post5a.setPostTitle("AnotherValidTitle");
        post5a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        post5a.setPostTags(new String[]{"tag3", "tag4"});
        post5a.setPostType("Difficult");
        post5a.setPostEmergency("Highly Needed");
        assertFalse(post5a.addPost());

        // 5: Test post with a body which is too short 2nd data set
        Post post5b = new Post();
        post5b.setPostID(10);
        post5b.setPostTitle("AnotherValidTitle");
        post5b.setPostBody("body is to short");
        post5b.setPostTags(new String[]{"tag3", "tag4"});
        post5b.setPostType("Easy");
        post5b.setPostEmergency("Ordinary");
        assertFalse(post5b.addPost());

        // 6: Testing a post with too long tag names
        Post post6a = new Post();
        post6a.setPostID(11);
        post6a.setPostTitle("AnotherValidTitle");
        post6a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post6a.setPostTags(new String[]{"tag3", "tagtagtagtagtag"});
        post6a.setPostType("Difficult");
        post6a.setPostEmergency("Highly Needed");
        assertFalse(post6a.addPost());

        // 6: Testing a post with too long tag names 2nd data set
        Post post6b = new Post();
        post6b.setPostID(12);
        post6b.setPostTitle("AnotherValidTitle");
        post6b.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post6b.setPostTags(new String[]{"tagtagtagtag", "tagtagtagtag"});
        post6b.setPostType("Difficult");
        post6b.setPostEmergency("Highly Needed");
        assertFalse(post6b.addPost());

        // 7: Testing a post with too many tags
        Post post7a = new Post();
        post7a.setPostID(13);
        post7a.setPostTitle("AnotherValidTitle");
        post7a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post7a.setPostTags(new String[]{"tag1", "tag2", "tag3", "tag4"});
        post7a.setPostType("Easy");
        post7a.setPostEmergency("Ordinary");
        assertFalse(post7a.addPost());

        // 7: Testing a post with too many tags 2nd data set
        Post post7b = new Post();
        post7b.setPostID(14);
        post7b.setPostTitle("AnotherValidTitle");
        post7b.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post7b.setPostTags(new String[]{"tag1", "tag2", "tag3", "tag4", "tag5", "tag6"});
        post7b.setPostType("Difficult");
        post7b.setPostEmergency("Highly Needed");
        assertFalse(post7b.addPost());

        // 8: Testing a post with an invalid post type
        Post post8a = new Post();
        post8a.setPostID(15);
        post8a.setPostTitle("AnotherValidTitle");
        post8a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post8a.setPostTags(new String[]{"tag3", "tag4"});
        post8a.setPostType("Difficulty");
        post8a.setPostEmergency("Highly Needed");
        assertFalse(post8a.addPost());

        // 8: Testing a post with an invalid post type 2nd data set
        Post post8b = new Post();
        post8b.setPostID(16);
        post8b.setPostTitle("AnotherValidTitle");
        post8b.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post8b.setPostTags(new String[]{"tag3", "tag4"});
        post8b.setPostType("Lebron");
        post8b.setPostEmergency("Highly Needed");
        assertFalse(post8b.addPost());

        // 9: Testing a post rated difficult with below 300 characters in the body
        Post post9a = new Post();
        post9a.setPostID(17);
        post9a.setPostTitle("AnotherValidTitle");
        post9a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure do.");
        post9a.setPostTags(new String[]{"tag3", "tag4"});
        post9a.setPostType("Difficult");
        post9a.setPostEmergency("Highly Needed");
        assertFalse(post9a.addPost());

        // 9: Testing a post rated difficult with below 300 characters in the body 2nd data set
        Post post9b = new Post();
        post9b.setPostID(18);
        post9b.setPostTitle("AnotherValidTitle");
        post9b.setPostBody("Lorem.");
        post9b.setPostTags(new String[]{"tag3", "tag4"});
        post9b.setPostType("Difficult");
        post9b.setPostEmergency("Highly Needed");
        assertFalse(post9b.addPost());

        // 10: Testing a post rated with a non-compatible emergency tag
        Post post10a = new Post();
        post10a.setPostID(19);
        post10a.setPostTitle("AnotherValidTitle");
        post10a.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post10a.setPostTags(new String[]{"tag3", "tag4"});
        post10a.setPostType("Difficult");
        post10a.setPostEmergency("Ordinary");
        assertFalse(post10a.addPost());

        // 10: Testing a post rated with a non-compatible emergency tag 2nd data set
        Post post10b = new Post();
        post10b.setPostID(20);
        post10b.setPostTitle("AnotherValidTitle");
        post10b.setPostBody("Lorem ipsum dolor sit amet consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post10b.setPostTags(new String[]{"tag3", "tag4"});
        post10b.setPostType("Easy");
        post10b.setPostEmergency("Highly Needed");
        assertFalse(post10b.addPost());
    }

    @Test
    void testAddComment() {
        Post post2a = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        //Test max comments on a easy post
        post2a.setPostID(2);
        post2a.setPostTitle("ValidTitle");
        post2a.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post2a.setPostTags(new String[]{"tag1", "tag2"});
        post2a.setPostType("Easy");
        post2a.setPostEmergency("Ordinary");
        
        // Here to test the comment
        post2a.addComment("This is a comment");
        post2a.addComment("This is a comment");
        assertTrue(post2a.addComment("This is a comment"));

        Post post2b = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        //Test max comments on a easy post 2ND data set
        post2b.setPostID(2);
        post2b.setPostTitle("ValidTitle");
        post2b.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post2b.setPostTags(new String[]{"tag1", "tag2"});
        post2b.setPostType("Easy");
        post2b.setPostEmergency("Ordinary");
        
        // Here to test the comment
        post2b.addComment("This is a comment");
        post2b.addComment("This is a comment");
        post2b.addComment("This is a comment");
        assertFalse(post2b.addComment("This is a comment"));


        Post post3a = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        //Max words on a comment
        post3a.setPostID(3);
        post3a.setPostTitle("ValidTitle");
        post3a.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post3a.setPostTags(new String[]{"tag1", "tag2"});
        post3a.setPostType("Easy");
        post3a.setPostEmergency("Ordinary");
        
        // Here to test the comment
        assertTrue(post3a.addComment("One two three four five six seven eight nine ten"));

        Post post3b = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        //Max words on a comment 2nd data set
        post3b.setPostID(3);
        post3b.setPostTitle("ValidTitle");
        post3b.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post3b.setPostTags(new String[]{"tag1", "tag2"});
        post3b.setPostType("Easy");
        post3b.setPostEmergency("Ordinary");
        
        // Here to test the comment
        assertFalse(post3b.addComment("One two three four five six seven eight nine ten eleven"));

        Post post4a = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        // min words on a comment
        post4a.setPostID(4);
        post4a.setPostTitle("ValidTitle");
        post4a.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post4a.setPostTags(new String[]{"tag1", "tag2"});
        post4a.setPostType("Easy");
        post4a.setPostEmergency("Ordinary");
        
        // Here to test the comment
        assertTrue(post4a.addComment("One two three four"));

        Post post4b = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        // min words on a comment 2nd data set
        post4b.setPostID(4);
        post4b.setPostTitle("ValidTitle");
        post4b.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post4b.setPostTags(new String[]{"tag1", "tag2"});
        post4b.setPostType("Easy");
        post4b.setPostEmergency("Ordinary");
        
        // Here to test the comment
        assertFalse(post4b.addComment("One two three"));

        Post post5a = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        //Test first letter must be upper case
        post5a.setPostID(5);
        post5a.setPostTitle("ValidTitle");
        post5a.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post5a.setPostTags(new String[]{"tag1", "tag2"});
        post5a.setPostType("Easy");
        post5a.setPostEmergency("Ordinary");
        
        // Here to test the comment
        assertTrue(post5a.addComment("This is a comment"));

        Post post5b = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        //Test first letter must be upper case 2nd data set
        post5b.setPostID(5);
        post5b.setPostTitle("ValidTitle");
        post5b.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post5b.setPostTags(new String[]{"tag1", "tag2"});
        post5b.setPostType("Easy");
        post5b.setPostEmergency("Ordinary");
        
        // Here to test the comment
        assertFalse(post5b.addComment("this is a comment"));

        Post post6a = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        //Testing maxx comments on a difficult post
        post6a.setPostID(6);
        post6a.setPostTitle("ValidTitle");
        post6a.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post6a.setPostTags(new String[]{"tag1", "tag2"});
        post6a.setPostType("Difficilt");
        post6a.setPostEmergency("Highly Needed");
        
        // Here to test the comment
        post6a.addComment("This is a comment");
        post6a.addComment("This is a comment");
        post6a.addComment("This is a comment");
        post6a.addComment("This is a comment");

        assertTrue(post6a.addComment("This is a comment"));

        Post post6b = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        //Testing maxx comments on a difficult post 2nd data set
        post6b.setPostID(6);
        post6b.setPostTitle("ValidTitle");
        post6b.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post6b.setPostTags(new String[]{"tag1", "tag2"});
        post6b.setPostType("Difficult");
        post6b.setPostEmergency("Highly Needed");
        
        // Here to test the comment
        post6b.addComment("This is a comment");
        post6b.addComment("This is a comment");
        post6b.addComment("This is a comment");
        post6b.addComment("This is a comment");
        post6b.addComment("This is a comment");
        assertFalse(post6b.addComment("This is a comment"));

        Post post7a = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        // Testing if first letter is a number or special character
        post7a.setPostID(7);
        post7a.setPostTitle("ValidTitle");
        post7a.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post7a.setPostTags(new String[]{"tag1", "tag2"});
        post7a.setPostType("Easy");
        post7a.setPostEmergency("Ordinary");
        
        // Here to test the comment
        assertFalse(post7a.addComment("1His is a comment"));

        Post post7b = new Post();
        
        // a post is created so that comments can be added to it for testinf the test cases
        // Testing if first letter is a number or special character 2nd data set
        post7b.setPostID(7);
        post7b.setPostTitle("ValidTitle");
        post7b.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        post7b.setPostTags(new String[]{"tag1", "tag2"});
        post7b.setPostType("Easy");
        post7b.setPostEmergency("Ordinary");
        
        // Here to test the comment
        assertFalse(post7b.addComment("@His is a comment"));
        
    }

    public static void main(String[] args) { // main file needs to be run for .txt files to be created 
        PostTest test = new PostTest();
        test.testAddPost();
        test.testAddComment();  
    }
}