// CS427 Issue link: https://github.com/hub4j/github-api/issues/1243

package org.kohsuke.github;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * Wrapper to define changed fields on issues action="edited"
 *
 * @see GHEventPayload.Issue
 */
@SuppressFBWarnings("UWF_UNWRITTEN_FIELD")
// CS427 Issue link: https://github.com/hub4j/github-api/issues/1243
public class GHIssueCommentChanges {

    private GHFrom body;

    /**
     * Old issue comment.
     *
     * @return old issue comment (or null if not changed)
     */
    public GHFrom getBody() {
        return body;
    }

    /**
     * Wrapper for changed values.
     */
    public static class GHFrom {
        private String from;

        /**
         * Previous value that was changed.
         *
         * @return previous value
         */
        public String getFrom() {
            return from;
        }
    }
}
