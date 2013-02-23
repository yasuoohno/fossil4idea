package org.jetbrains.fossil.local;

import com.intellij.openapi.vcs.FilePath;
import com.intellij.openapi.vcs.VcsException;
import com.intellij.openapi.vcs.changes.Change;
import com.intellij.openapi.vcs.rollback.DefaultRollbackEnvironment;
import com.intellij.openapi.vcs.rollback.RollbackProgressListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.fossil.FossilVcs;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Irina.Chernushina
 * Date: 2/15/13
 * Time: 11:55 PM
 */
public class FossilRollbackEnvironment extends DefaultRollbackEnvironment {
  private final FossilVcs myFossilVcs;

  public FossilRollbackEnvironment(final FossilVcs fossilVcs) {
    myFossilVcs = fossilVcs;
  }

  @Override
  public void rollbackChanges(final List<Change> changes, final List<VcsException> vcsExceptions,
                              @NotNull final RollbackProgressListener listener) {
     LocalUtil.rollbackChanges(changes, listener);
  }

  @Override
  public void rollbackMissingFileDeletion(final List<FilePath> files, final List<VcsException> exceptions,
                                          final RollbackProgressListener listener) {
    //To change body of implemented methods use File | Settings | File Templates.
  }
}
