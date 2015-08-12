package com.github.ruediste.remoteJUnit.common.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;

public interface RunnerRemote extends Remote {
    Description getDescription() throws RemoteException;

    void run(RunNotifierRemote notifier) throws RemoteException;

    int testCount() throws RemoteException;

    void filter(FilterRemote filter) throws NoTestsRemainException,
            RemoteException;

    public void sort(SorterRemote sorter) throws RemoteException;

}
