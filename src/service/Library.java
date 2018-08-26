package service;

import java.util.ArrayList;
import bean.MediaItem;
import exception.ItemException;

public interface Library {
	
void addItem(MediaItem m);
boolean searchItemById(int id) throws ItemException;
ArrayList<MediaItem> getItems();
MediaItem updateItem(int id) throws ItemException;
boolean deleteItem(int id) throws ItemException;
}
