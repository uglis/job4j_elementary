package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAllTheSameNames() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Igor");
        Item item2 = new Item("Vasea");
        Item item3 = new Item("Sasha");
        Item item4 = new Item("Igor");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        Item[] result = tracker.findByName(item1.getName());
        Item[] expected = {item1, item4};
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Igor");
        Item item4 = new Item("Igor");
        tracker.add(item1);
        tracker.add(item4);
        Item[] result = tracker.findAll();
        Item[] expected = {item1, item4};
        assertThat(result, is(expected));
    }


}