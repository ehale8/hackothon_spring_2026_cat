using UnityEngine;
using UnityEngine.InputSystem;

public class Player : MonoBehaviour
{
   public Rigidbody2D rb;
    public PlayerInput playerInput;
    public float speed;

    public Vector2 moveInput;

    public Animator animator; //Added later.
    public SpriteRenderer sprite;


    void FixedUpdate()
    {
        float targetSpeed = moveInput.x * speed;
        rb.linearVelocity = new Vector2 (targetSpeed, rb.linearVelocity.y);
        if (targetSpeed != 0)
        {
            animator.SetBool("OntheMove", true);
        } else { animator.SetBool("OntheMove", false); }
     
    }


    public void OnMove(InputValue value)
    {
        moveInput = value.Get<Vector2>();
    }
}