import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class Main {

        public static void main(String[] args) throws IOException {
            write("Middle of the night", "Elli Dua");
            System.out.println(read());

        }
        public static void write(String title, String author) throws IOException {
            FileWriter fileWriter = new FileWriter("Song.txt");
            fileWriter.write(title +"\n");
            fileWriter.write(author +  "\n");
           fileWriter.write("I summoned you, please come to me\n" +
                   "Don't bury thoughts that you really want\n" +
                   "I fill you up, drink from my cup\n" +
                   "Within me lies what you really want\n"+
                   "Come, lay me down\n" +
                   "'Cause you know this\n" +
                   "'Cause you know this sound\n"+
                   "In the middle of the night, in the middle of the night\n" +
                   "Just call my name, I'm yours to tame\n" +
                   "In the middle of the night, in the middle of the night\n" +
                   "I'm wide awake, I crave your taste\n" +
                   "All night long 'til morning comes\n" +
                   "I'm getting what is mine, you gon' get yours, oh no, ooh\n" +
                   "In the middle of the night, in the middle of the night, oh\n"+
                   "In the middle of the night, in the middle of the night\n" +
                   "Just call my name, I'm yours to tame\n" +
                   "In the middle of the night, in the middle of the night\n" +
                   "I'm wide awake, I crave your taste\n" +
                   "All night long 'til morning comes\n" +
                   "I'm getting what is mine, you gon' get yours, oh no, ooh\n" +
                   "In the middle of the night, in the middle of the night, oh\n"+
                   "These burning flames, these crashing waves\n" +
                   "Wash over me like a hurricane\n" +
                   "I'll captivate, you're hypnotized\n" +
                   "Feel powerful, but it's me again\n"+
                   "Come, lay me down\n" +
                   "'Cause I know this\n" +
                   "'Cause I know this sound\n"+
                   "In the middle of the night, in the middle of the night\n" +
                   "Just call my name, I'm yours to tame\n" +
                   "In the middle of the night, in the middle of the night\n" +
                   "I'm wide awake, I crave your taste\n" +
                   "All night long 'til morning comes\n" +
                   "I'm getting what is mine, you gon' get yours, oh no, ooh\n" +
                   "In the middle of the night, in the middle of the night, oh\n"+
                   "And just call on me, ah, just call my name\n" +
                   "Like you mean it\n" +
                   "In the middle of the night, in the middle of the night\n" +
                   "Just call my name, I'm yours to tame\n" +
                   "In the middle of the night, in the middle of the night\n" +
                   "I'm wide awake, I crave your taste\n" +
                   "All night long 'til morning comes\n" +
                   "I'm getting what is mine, you gon' get yours, oh\n" +
                   "In the middle of the night, in the middle of the night, oh, whoa\n");

            fileWriter.close();
        }

        public static Song read() throws IOException {
            FileReader fileReader = new FileReader("Song.txt");
            Scanner scanner = new Scanner(fileReader);
            Song song = new Song();
            StringBuilder stringBuilder = new StringBuilder();
            song.setTitle(song.getTitle());
            song.setAuthor(song.getAuthor());
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()+"\n");
            }
            song.setText(stringBuilder.toString());
            fileReader.close();

            return song;
        }
    }