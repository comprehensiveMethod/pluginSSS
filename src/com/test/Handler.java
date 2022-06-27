package com.test;


import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import java.util.Random;


public class Handler implements Listener {
    //АЙДИ ПРЕДМЕТА И СЛЕД ЭТО СУБАЙДИ
    int[] regular = new int[]{0,27900,0, 2790,0, 246,3, 30188,0, 30243,0, 30191,0, 2279,0, 264,0, 3323,0};
    int[] rare = {0, 3323,4, 3323,1, 2280,0, 2281,0, 2259,12, 194,0, 227,1, 250,2, 250,3, 250,5, 250,4, 250,11, 246,0, 30175,0, 30176,0, 30177,0, 30178,0, 30149,0 };
    int[] epic = {0, 194,1, 227,2, 250,13, 250,14, 504,0, 2263,0, 2259,8, 2280,1, 2279,1 };
    int[] mythic = {0, 2657,0, 2563,0, 2559,2, 2560,2, 3361,0, 2260,1, 3362,0, 3363,0, 3364,0, 3369,0, 3358,0, 3359,0, 3370,0, 3371,0, 3373,0, 3372,0, 3365,0, 3366,0, 3367,0, 3368,0, 265,0};
    int[] ultra = {0,2659,0, 2670,0, 2269,0, 3374,0, 3375,0, 3376,0, 3377,0, 2685,0, 2684,0, 3179,0, 503,0, 511,0, 505,0, 194,2};
    int[] superUltra = {0,10256,0, 2255,0, 2260,10, 2680,0, 10270,0, 194,3};

    @EventHandler
        public void replace(PlayerInteractEvent e){
        Action a = e.getAction();
        if(a == Action.RIGHT_CLICK_BLOCK){
            short subID;
            int i;
            Player p = e.getPlayer();
            Inventory inv = p.getInventory();
            ItemStack prizeItem = new ItemStack(123,1,(short) 0);
            ItemStack playerItem = p.getItemInHand();

            if(playerItem.getTypeId() == 2271 && playerItem.getDurability() == 0){
                p.playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 3);
                Random random = new Random();
                int r = random.nextInt(1000)+1;
                //ИФЫ ДЛЯ РАНДОМА ВЕЩИ
                if(r>0 && r<651) {
                    i = random.nextInt(regular.length - 1);
                    if (i % 2 == 0) {
                        i = i + 1;
                    }
                    prizeItem.setTypeId(regular[i]);
                    if (regular[i] == 264) {
                        prizeItem.setAmount(4);
                    }
                    subID = (short) regular[i + 1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " + ChatColor.GRAY + "ВАМ ВЫПАЛА ОБЫЧНАЯ ВЕЩЬ!");
                }
                if(r>650 && r<821){
                    i = random.nextInt(rare.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(rare[i]);
                    subID = (short) rare[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.BLUE + "ВАМ ВЫПАЛА РЕДКАЯ ВЕЩЬ!");
                }
                if(r>821 && r<921){
                    i = random.nextInt(epic.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(epic[i]);
                    subID = (short) epic[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.LIGHT_PURPLE + "ВАМ ВЫПАЛА ЭПИК ВЕЩЬ!");
                }
                if(r>920 && r<971){
                    i = random.nextInt(mythic.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(mythic[i]);
                    subID = (short) mythic[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.RED + "ВАМ ВЫПАЛА МИФИК ВЕЩЬ!");
                }
                if(r>970 && r<996){
                    i = random.nextInt(ultra.length-1);
                    if(i%2==0){
                        i = i+1;
                    }

                    prizeItem.setTypeId(ultra[i]);
                    subID = (short) ultra[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.YELLOW + "ВАМ ВЫПАЛА УЛЬТРА ВЕЩЬ!");
                }
                if(r>995){
                    i = random.nextInt(superUltra.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(superUltra[i]);
                    subID = (short) superUltra[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.GOLD + "ВАМ ВЫПАЛА УЛЬТРА РЕДКАЯ ВЕЩЬ!");
                }
                }
            if(playerItem.getTypeId() == 2271 && playerItem.getDurability() == 2){
                p.playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 3);
                Random random = new Random();
                int r = random.nextInt(1000)+1;
                //ИФЫ ДЛЯ РАНДОМА ВЕЩИ
                if(r>0 && r<651) {
                    i = random.nextInt(regular.length - 1);
                    if (i % 2 == 0) {
                        i = i + 1;
                    }
                    prizeItem.setTypeId(regular[i]);
                    if (regular[i] == 264) {
                        prizeItem.setAmount(4);
                    }
                    subID = (short) regular[i + 1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " + ChatColor.GRAY + "ВАМ ВЫПАЛА ОБЫЧНАЯ ВЕЩЬ!");
                }
                if(r>650 && r<821){
                    i = random.nextInt(rare.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(rare[i]);
                    subID = (short) rare[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.BLUE + "ВАМ ВЫПАЛА РЕДКАЯ ВЕЩЬ!");
                }
                if(r>821 && r<921){
                    i = random.nextInt(epic.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(epic[i]);
                    subID = (short) epic[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.LIGHT_PURPLE + "ВАМ ВЫПАЛА ЭПИК ВЕЩЬ!");
                }
                if(r>920 && r<971){
                    i = random.nextInt(mythic.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(mythic[i]);
                    subID = (short) mythic[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.RED + "ВАМ ВЫПАЛА МИФИК ВЕЩЬ!");
                }
                if(r>970 && r<996){
                    i = random.nextInt(ultra.length-1);
                    if(i%2==0){
                        i = i+1;
                    }

                    prizeItem.setTypeId(ultra[i]);
                    subID = (short) ultra[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.YELLOW + "ВАМ ВЫПАЛА УЛЬТРА ВЕЩЬ!");
                }
                if(r>995){
                    i = random.nextInt(superUltra.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(superUltra[i]);
                    subID = (short) superUltra[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.GOLD + "ВАМ ВЫПАЛА УЛЬТРА РЕДКАЯ ВЕЩЬ!");
                }
            }
            if(playerItem.getTypeId() == 2270 && playerItem.getDurability() == 0){
                p.playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 3);
                Random random = new Random();
                int r = random.nextInt(1000)+1;
                //ИФЫ ДЛЯ РАНДОМА ВЕЩИ
                if(r>0 && r<651) {
                    i = random.nextInt(regular.length - 1);
                    if (i % 2 == 0) {
                        i = i + 1;
                    }
                    prizeItem.setTypeId(regular[i]);
                    if (regular[i] == 264) {
                        prizeItem.setAmount(4);
                    }
                    subID = (short) regular[i + 1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " + ChatColor.GRAY + "ВАМ ВЫПАЛА ОБЫЧНАЯ ВЕЩЬ!");
                }
                if(r>650 && r<821){
                    i = random.nextInt(rare.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(rare[i]);
                    subID = (short) rare[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.BLUE + "ВАМ ВЫПАЛА РЕДКАЯ ВЕЩЬ!");
                }
                if(r>821 && r<921){
                    i = random.nextInt(epic.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(epic[i]);
                    subID = (short) epic[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.LIGHT_PURPLE + "ВАМ ВЫПАЛА ЭПИК ВЕЩЬ!");
                }
                if(r>920 && r<971){
                    i = random.nextInt(mythic.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(mythic[i]);
                    subID = (short) mythic[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.RED + "ВАМ ВЫПАЛА МИФИК ВЕЩЬ!");
                }
                if(r>970 && r<996){
                    i = random.nextInt(ultra.length-1);
                    if(i%2==0){
                        i = i+1;
                    }

                    prizeItem.setTypeId(ultra[i]);
                    subID = (short) ultra[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.YELLOW + "ВАМ ВЫПАЛА УЛЬТРА ВЕЩЬ!");
                }
                if(r>995){
                    i = random.nextInt(superUltra.length-1);
                    if(i%2==0){
                        i = i+1;
                    }
                    prizeItem.setTypeId(superUltra[i]);
                    subID = (short) superUltra[i+1];
                    prizeItem.setDurability(subID);
                    inv.addItem(prizeItem);
                    p.updateInventory();
                    p.sendMessage(ChatColor.DARK_GREEN + "[PRIZE] " +ChatColor.GOLD + "ВАМ ВЫПАЛА УЛЬТРА РЕДКАЯ ВЕЩЬ!");
                }
            }
        }
    }


}


