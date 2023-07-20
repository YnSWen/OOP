package Domen;

import java.util.Iterator;
import java.util.List;


public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> streams;
    private int streamId;
/**
 * Класс, описывающий поведение для потока студентов
 * @param streams Поток студентов
 * @param streamId Id потока
 */

    public StudentStream(List<StudentGroup> streams, int streamId) {
        this.streams = streams;
        this.streamId = streamId;
    }


    public List<StudentGroup> getStreams() {
        return streams;
    }


    public void setStreams(List<StudentGroup> streams) {
        this.streams = streams;
    }


    public int getStreamId() {
        return streamId;
    }


    public void setStreamId(int streamId) {
        this.streamId = streamId;
    }


    @Override
    public String toString() {
        return "Номер потока =" + streamId + "Список студентов: " + streams.toString();
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>(){
        private int counter;

        @Override
        public boolean hasNext() {
            if(counter < streams.size())
            { 
                return true;
            }
            else
            {
                return false;
            }
       }

        @Override
        public StudentGroup next() {
            return streams.get(counter++);
        }
        };
    }
}
    
    

