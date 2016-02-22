/*
 * Copyright 2016 Talendrys.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.jangos.realm.controller.world;

import eu.jangos.realm.hibernate.HibernateUtil;
import eu.jangos.realm.model.world.Item;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ItemService is the controller class for items loading.
 * @author Warkdev
 * @since 21-02-2016
 */
public class ItemService {
    
    private static final Logger logger = LoggerFactory.getLogger(ItemService.class);   
    
    /**
     * Return the item which has the given ID.
     * @param id The id of the item to be found.
     * @return The corresponding item or null if the item is not found.
     */
    public Item getItemByID(int id) {
        logger.debug("Loading information for the item with the id "+id);
        
        try(Session session = HibernateUtil.getWorldSession().openSession()) {
            return (Item) session.createCriteria(Item.class)
                    .setFetchMode("inventorytype", FetchMode.JOIN)
                    .add(Restrictions.eq("entry", id)).uniqueResult();
            
        } catch (HibernateException he) {
            logger.debug("There was an error connecting to the database.");
            return null;
        }
    }
}
