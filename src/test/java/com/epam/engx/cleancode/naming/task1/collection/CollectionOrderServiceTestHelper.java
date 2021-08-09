package com.epam.engx.cleancode.naming.task1.collection;

import com.epam.engx.cleancode.naming.task1.thirdpartyjar.CollectionService;
import com.epam.engx.cleancode.naming.task1.thirdpartyjar.Submitable;

public class CollectionOrderServiceTestHelper {

    public CollectionOrderService getService(){
        return new CollectionOrderService();
    }

    public void submit(Submitable collectionOrderService) {
        ((CollectionOrderService) collectionOrderService).submitOrder(new OrderDummy());
    }

    public void setNotificationManager(NotificationManagerMock notificationManagerMock, Submitable collectionOrderService) {
        ((CollectionOrderService) collectionOrderService).setNotificationManager(notificationManagerMock);
    }

    public void setCollectionService(Submitable collectionOrderService, CollectionService collectionServiceStub) {
        ((CollectionOrderService) collectionOrderService).setCollectionService(collectionServiceStub);
    }
}
